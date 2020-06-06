jQuery(document).ready(function($) {

    jQuery(window).resize(function() {
        $("#spacer").css({'height':($("#fixed-header").height()+'px')});     
    });
/*
    jQuery(window).resize(function() {
        $("#menu_close").css({'height':($(".home_header").height()+'px')});   
        $("#menu_close").css({'line-height':($(".home_header").height()+'px')});   
    });
*/
    jQuery(window).resize();

    // Alert bar
    jQuery("#alert-bar .close").click(function(e) {
        jQuery(this).parent("#alert-bar").hide();
        jQuery(window).resize();        
    });

    jQuery(".digimeg-main-nav>li>a").click(function(e) {
        jQuery(window).resize();
    });           

});

var timeout;

jQuery(window).load(function() {
    jQuery(window).resize();
});

 $(window).load(function() {
    myFunction();
    $(window).resize(function() {        
        myFunction();
    });
    
    function myFunction() {
        var width = $(window).width();
        if (width < 748) {
            $(document).on('scroll', function () {
                if ($(this).scrollTop() > 10) {
                    //$('.top_links').stop().hide(300);
                    $('.top_links').addClass('tl-hidden');
                    $('.top_links').removeClass('tl-show');                    
                }
                else {
                    //$('.top_links').stop().show(300);
                    $('.top_links').addClass('tl-show');              
                    $('.top_links').removeClass('tl-hidden');               
                }

    if ($('.top_links').hasClass('tl-hidden')){
            $('.top_links').stop().hide(300);
    }else{
            $('.top_links').stop().show(300);
            clearTimeout(timeout);  

                        timeout = setTimeout(function() {
                    jQuery(window).resize();        

            }, 300);

    }    

            });
        }
        else {
            $('.top_links').show();
            $(document).unbind('scroll');
        }
    }



});
