(function (document, $) {
    "use strict";

    // when dialog gets injected
    $(document).on("foundation-contentloaded", function (e) {
        // if there is already an inital value make sure the according target element becomes visible
        let s = $('.cq-dialog-radio_button-showhide').find('input[type=radio]:checked').val();
           if(s == 'authorable'){
            $(".toggle-locationfield").removeClass("hide");
        }else{
            $(".toggle-locationfield").addClass("hide");
        }
    });

    $(document).on("change", ".cq-dialog-radio_button-showhide", function (e) {
        if(e.target.value == 'authorable'){
            $(".toggle-locationfield").removeClass("hide");
        }else{
            $(".toggle-locationfield").addClass("hide");
        }
    });

  
})(document, Granite.$);
