package com.re.wanderlust.core.models.impl;

import com.re.wanderlust.core.constants.TestConstants;
import com.re.wanderlust.core.testcontext.AppAemContext;
import io.wcm.testing.mock.aem.junit5.AemContext;
import io.wcm.testing.mock.aem.junit5.AemContextExtension;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;


@ExtendWith({AemContextExtension.class, MockitoExtension.class})
class LoginModelImplTest {

    public static final String LOGIN_MODEL_JSON = "loginModel.json";
    private final AemContext ctx = AppAemContext.newAemContext();
    private LoginModelImpl loginModel;


    @BeforeEach
    void setUp() {
        ctx.addModelsForClasses(LoginModelImpl.class);
        ctx.load().json(TestConstants.JSON_FILE_PATH+ LOGIN_MODEL_JSON,TestConstants.CONTENT_PATH);
    }

    @Test
    void testLoginLinkText(){
        loginModel = getModel("/content/loginModel");
        assertEquals("Login_Link_Text",loginModel.getLoginLinkText());
    }

    @Test
    void negativeTestLoginLinkText(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getLoginLinkText());
    }

    @Test
    void testImgTitle(){
        loginModel = getModel("/content/loginModel");
        assertEquals("Img_Title",loginModel.getImgTitle());
    }

    @Test
    void negativeTestImgTitle(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getImgTitle());
    }

    @Test
    void testIncludeProfileImage(){
        loginModel = getModel("/content/loginModel");
        assertEquals("Include_Profile_Image",loginModel.getIncludeProfileImage());
    }

    @Test
    void negativeTestIncludeProfileImage(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getIncludeProfileImage());
    }

    @Test
    void testMyProfileText(){
        loginModel = getModel("/content/loginModel");
        assertEquals("My",loginModel.getMyProfileText());
    }

    @Test
    void negativeTestMyProfileText(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getMyProfileText());
    }

    @Test
    void testMyProfileUrl(){
        loginModel = getModel("/content/loginModel");
        assertEquals("My_Profile_Url",loginModel.getMyProfileUrl());
    }

    @Test
    void negativeTestMyProfileUrl(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getMyProfileUrl());
    }

    @Test
    void testMyProfileAnchorTitle(){
        loginModel = getModel("/content/loginModel");
        assertEquals("My_Profile_Anchor_Title",loginModel.getMyProfileAnchorTitle());
    }

    @Test
    void negativeTestMyProfileAnchorTitle(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getMyProfileAnchorTitle());
    }

    @Test
    void testEditProfileText(){
        loginModel = getModel("/content/loginModel");
        assertEquals("Edit_Profile",loginModel.getEditProfileText());
    }

    @Test
    void negativeTestEditProfileText(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getEditProfileText());
    }

    @Test
    void testEditProfileUrl(){
        loginModel = getModel("/content/loginModel");
        assertEquals("Edit_Profile_Url",loginModel.getEditProfileUrl());
    }

    @Test
    void negativeTestEditProfileUrl(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getEditProfileUrl());
    }

    @Test
    void testEditProfileAnchorTitle(){
        loginModel = getModel("/content/loginModel");
        assertEquals("Edit_Profile_Anchor_Title",loginModel.getEditProfileAnchorTitle());
    }

    @Test
    void negativeTestEditProfileAnchorTitle(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getEditProfileAnchorTitle());
    }

    @Test
    void testLogoutProfileText(){
        loginModel = getModel("/content/loginModel");
        assertEquals("LogOut_Profile_Text",loginModel.getLogoutProfileText());
    }

    @Test
    void negativeTestLogoutProfileText(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getLogoutProfileText());
    }

    @Test
    void testLogoutProfileUrl(){
        loginModel = getModel("/content/loginModel");
        assertEquals("LogOut1",loginModel.getLogoutProfileUrl());
    }

    @Test
    void negativeTestLogoutProfileUrl(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getLogoutProfileUrl());
    }

    @Test
    void testLogoutProfileAnchorTitle(){
        loginModel = getModel("/content/loginModel");
        assertEquals("LogOut2",loginModel.getLogoutProfileAnchorTitle());
    }

    @Test
    void negativeTestLogoutProfileAnchorTitle(){
        loginModel = getModel("/content/loginModel");
        assertNotEquals("",loginModel.getLogoutProfileAnchorTitle());
    }

    private LoginModelImpl getModel(String currentResource){
        ctx.currentResource(currentResource);
        return ctx.request().adaptTo(LoginModelImpl.class);
    }

}