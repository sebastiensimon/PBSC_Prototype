
// TODO : Transformation to the modular structure

$(function(){

	///////////////////////////////////////////////
	// Mouse over event for the Main menu items //
	///////////////////////////////////////////////
	$('.digimeg-main-nav>li>a').on('click', function (){
                $("#menu_close").show();
                $('#menu_close').css('display', 'block');
                $("#menu").hide();
                $(".digimeg-main-nav li a").css('background','#1b9e7e');
                $(".digimeg-main-nav li a").css('position','absolute');
                $(".digimeg-main-nav li a").css('right','0');
                $(".digimeg-main-nav li a").css('height','88px');
                $(".digimeg-main-nav li a").css('opacity','0.9');
                $(".digimeg-main-nav li a").css('color','#fff');
		// Get the subnav's ID from [data-subnav] attribute of the currently hovered menu item
		var navContentId = $(this).data('subnav');
		// Stop (in case the sub nav was sliding up) and slidedown
		$('#'+navContentId).stop().slideDown({ queue : false});

		////////////////////////////////////////////////////////////////
		// show the little arrow on the currently hovered menu item //
		////////////////////////////////////////////////////////////////
		var $el = $(this);
		var mark = $el.find('.digimeg-active-mark');

		mark.css({
		   'left' : ($el.outerWidth()/2)-(mark.outerWidth()/2),
		   'top' : $el.outerHeight()
		}).show();
		////////////////////////////////////////////////////////////////

	});

	//////////////////////////////////////////////
	// Mouse out event for the Main menu items //
	//////////////////////////////////////////////
	$('#menu_close').on('click', function (){
            $("#menu_close").hide();
                $("#menu").show();
                $(".digimeg-main-nav li a").css('background','none');
                $(".digimeg-main-nav li a").css('color','#2b6859');
		// Find the subnav's id from the [data-subnav] attribute of the currently hovered item
		var navContentId = $('.digimeg-main-nav>li>a').data('subnav');
		// Stop ( in case the sub nav was sliding down ) and slide up
		$('#'+navContentId).stop().slideUp({ queue : false});

		////////////////////////////////////////////////////////////////////////////////
		// Hide the active mark from the Menu item on which the event was triggered //
		////////////////////////////////////////////////////////////////////////////////
		var $el = $(this);
		var mark = $el.find('.digimeg-active-mark');

		mark.css({
		   'left' : ($el.outerWidth()/2)-(mark.outerWidth()/2),
		   'top' : 0
		}).hide();
		//////////////////////////////////////////////////////////////////////////////////
	});


	// Events to make the subnav's stay when they are being hovered over

	/////////////////////////////////////////////////
	// When the mouse is hovering over the subnav //
	/////////////////////////////////////////////////
	$('.digimeg-sub-nav>li').on('click', function () {

		// Stop ( in case the subnav was sliding up) and slide down
		$(this).stop().slideDown({ queue : false});

	});

	/////////////////////////////////////////////////
	// When the mouse has moved out of the subnav //
	/////////////////////////////////////////////////

	$('#close').on('click', function (){
		// Stop ( in case the sub nav was sliding down ) and slide up
		$('.digimeg-sub-nav>li').stop().slideUp({ queue : false});
	});

	if ( $( window ).width() > 760 ) {
        if($('#primary_menu li a').hasClass( "active" )) {
            var data_toggle = $('#primary_menu li a').attr("data-dropdown");
            $("#" + data_toggle).show();
        }
        $('#primary_menu li a').on('click',function() {
            var active = $(this).hasClass( "active" );

            var data_toggle = $(this).attr("data-dropdown");
			$('.active').removeClass('active');
			$(this).addClass('active');  
			/* OU Fixing navigation on top*/
			$('.SubmenuOnHover').hide();
			$('#' + data_toggle).show();
			
           /* if(data_toggle == 'About_SubmenuOnHover') {
                $('.active').removeClass('active');
                $(this).addClass('active');  
                $("#About_SubmenuOnHover").show();
                $("#Academics_SubmenuOnHover").hide();
                $("#Future_SubmenuOnHover").hide();
                $("#Current_SubmenuOnHover").hide();
                $("#Donors_SubmenuOnHover").hide();
                $("#Community_SubmenuOnHover").hide();
            }

            if (data_toggle == 'Academics_SubmenuOnHover'){
                $('.active').removeClass('active');
                $(this).addClass('active');                
                $("#Academics_SubmenuOnHover").show();
                 $("#About_SubmenuOnHover").hide();
                 $("#Future_SubmenuOnHover").hide();
                 $("#Current_SubmenuOnHover").hide();
                 $("#Donors_SubmenuOnHover").hide();
                 $("#Community_SubmenuOnHover").hide();
            }

            if (data_toggle == 'Future_SubmenuOnHover'){
                $('.active').removeClass('active');
                $(this).addClass('active');                                                                                
                $("#Future_SubmenuOnHover").show();
                $("#Current_SubmenuOnHover").hide();
                $("#Academics_SubmenuOnHover").hide();
                 $("#About_SubmenuOnHover").hide();
                 $("#Donors_SubmenuOnHover").hide();
                 $("#Community_SubmenuOnHover").hide();
            }
            if (data_toggle == 'Current_SubmenuOnHover'){
                $('.active').removeClass('active');
                $(this).addClass('active');                  
                $("#Future_SubmenuOnHover").hide();
                $("#Current_SubmenuOnHover").show();
                $("#Academics_SubmenuOnHover").hide();
                 $("#About_SubmenuOnHover").hide();
                 $("#Donors_SubmenuOnHover").hide();
                 $("#Community_SubmenuOnHover").hide();
            }
            if (data_toggle == 'Donors_SubmenuOnHover'){
                $('.active').removeClass('active');
                $(this).addClass('active');                  $("#Donors_SubmenuOnHover").show();
                $("#Academics_SubmenuOnHover").hide();
                 $("#About_SubmenuOnHover").hide();
                 $("#Future_SubmenuOnHover").hide();
                  $("#Current_SubmenuOnHover").hide();
                 $("#Community_SubmenuOnHover").hide();
            }

            if (data_toggle == 'Community_SubmenuOnHover'){
                $('.active').removeClass('active');
                $(this).addClass('active');  
                $("#Community_SubmenuOnHover").show();
                $("#Academics_SubmenuOnHover").hide();
                 $("#About_SubmenuOnHover").hide();
                 $("#Future_SubmenuOnHover").hide();
                 $("#Current_SubmenuOnHover").hide();
                 $("#Donors_SubmenuOnHover").hide();
            }*/

        });
	} else {
		$('#primary_menu li a').on('mouseover',function() {
            $('#primary_menu li ul').remove();
            that = $(this);
            $('#primary_menu li a').removeClass('active')
            var subm =  $(this).data('submenu') ;
            $(subm).each(function(){
            	that.parent().append( $(this).html());
			})

           // $(this).parent().append( $(subm).html());
        });
        $("#primary_menu li a.active").removeClass("active");

        $("#primary_menu li a.active").trigger('mouseover');
	}

});
