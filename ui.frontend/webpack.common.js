'use strict';

const path = require('path');
const webpack = require('webpack');
const MiniCssExtractPlugin = require("mini-css-extract-plugin");
const TSConfigPathsPlugin = require('tsconfig-paths-webpack-plugin');
const TSLintPlugin = require('tslint-webpack-plugin');
const CopyWebpackPlugin = require('copy-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');
// const BundleAnalyzerPlugin = require('webpack-bundle-analyzer').BundleAnalyzerPlugin;

const SOURCE_ROOT = __dirname + '/src/main/webpack';

module.exports = {
    resolve: {
        extensions: ['.js', '.ts'],
        plugins: [new TSConfigPathsPlugin({
            configFile: "./tsconfig.json"
        })]
    },
    entry: {
        site: SOURCE_ROOT + '/site/main.ts',
        dependencies: SOURCE_ROOT + '/site/vendors.js'
    },
    output: {
        filename: (chunkData) => {
            return chunkData.chunk.name === 'dependencies' ? 'clientlib-dependencies/[name].js' : 'clientlib-site/[name].js';
        },
        path: path.resolve(__dirname, 'dist'),
        chunkFilename: 'clientlib-dynamic-modules/resources/[name].[contenthash].js',
        publicPath: "/etc.clientlibs/re-wanderlust/clientlibs/",
    },
    module: {
        rules: [{
                test: /\.tsx?$/,
                exclude: [
                    /(node_modules)/
                ],
                use: [{
                        loader: "ts-loader"
                    },
                    {
                        loader: "webpack-import-glob-loader",
                        options: {
                            url: false
                        }
                    }
                ]
            },
            {
                test: /\.scss$/,
                use: [
                    MiniCssExtractPlugin.loader,
                    {
                        loader: "css-loader",
                        options: {
                            url: false
                        }
                    },
                    {
                        loader: 'postcss-loader',
                        options: {
                            plugins() {
                                return [
                                    require('autoprefixer')
                                ];
                            }
                        }
                    },
                    {
                        loader: "sass-loader",
                        options: {
                            url: false
                        }
                    },
                    {
                        loader: "webpack-import-glob-loader",
                        options: {
                            url: false
                        }
                    }
                ]
            }
        ]
    },
    plugins: [
        new CleanWebpackPlugin(),
        new webpack.NoEmitOnErrorsPlugin(),
        new MiniCssExtractPlugin({
            filename: 'clientlib-[name]/[name].css',
            chunkFilename: 'clientlib-[name]/[name].css'
        }),
        // new BundleAnalyzerPlugin(),
        new TSLintPlugin({
            files: [SOURCE_ROOT + '/**/*.ts', SOURCE_ROOT + '/**/*.tsx'],
            config: './tslint.json'
        }),
        new CopyWebpackPlugin([
            { from: path.resolve(__dirname, SOURCE_ROOT + '/resources'), to: './clientlib-site/resources' }
        ]),
    ],
    stats: {
        assetsSort: "chunks",
        builtAt: true,
        children: false,
        chunkGroups: true,
        chunkOrigins: true,
        colors: false,
        errors: true,
        errorDetails: true,
        env: true,
        modules: false,
        performance: true,
        providedExports: false,
        source: false,
        warnings: true
    }
};
