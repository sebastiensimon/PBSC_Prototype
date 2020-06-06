$(function() {
	
	//Navigation
 	$('.nav.navbar-nav a').append('<span style="font-size:16px;" class="pull-right hidden-xs showopacity "></span>');
	//Calendar
	if( $('.events').length > 0){
		var feedCal = $('.events .getevents').data("feed");
		$.get("https://www.palmbeachstate.edu/_resources/cs/eventshandler.ashx", {feed:feedCal},function(response){
			$('.events .getevents').html(response.desktop);
			$('.container-events').html(response.phone);
			$('.wrapper').scrollbar();
			$('.container-events').customScrollbar();
		})
	}
	//News
	if($('.ou-news').length > 0){
		$.get("https://www.palmbeachstate.edu/_resources/cs/wnl_handler.ashx", {feed:feed, quantity: quantity},function(response){
			$('.ou-news').html(response);
		});
		$('.ou-news').on("click", ".pagination a", function(e){
			e.preventDefault();
			var link = $(this).attr("href"); 
			$.get(link,function(response){
					$('.ou-news').html(response);
			});	 
		});
	}
	if($('.ou-news-home').length > 0){
		$.get("https://www.palmbeachstate.edu/_resources/cs/wnl_home_handler.ashx", {feed:feedHome},function(response){
			$('.ou-news-home').html(response);
		});
	}
	if($("#instaFeed").length > 0){
		if(instagramClient !== 'undefined'){
			var client = (instagramClient !== 'undefined') ? instagramClient : '301791447'; 
			var token = (instagramToken !== 'undefined') ? instagramToken : '301791447.b68d246.3f0ffdaeb0ef41808a0e433ea290f348'; 
			var count = (instagramItems !== 'undefined') ? instagramItems : 20; 
			//Intagram
			 var
				apiMap = {
					endpoint: 'https://api.instagram.com',
					version: 'v1',
					client_id: client,
					query_type: 'media',
					itemsToDisplay: count,
					identifiers : {
						access_token : token
					},
					use_endpoint : null

				};
			var url = "https://www.palmbeachstate.edu/_resources/cs/instagram/instagramhandler-home.ashx";//apiMap.endpoint + '/' +  apiMap.version + '/users/' +  apiMap.client_id + '/media/recent/';

			   $.ajax({
					url: url, 
					dataType: 'jsonp',
				   	jsonpCallback: 'jsonp',
					type: 'get',
					data: {client_id: apiMap.identifiers.access_token, access_token: apiMap.identifiers.access_token, count: apiMap.itemsToDisplay}
				}).done(function(data) {
					var array = data.data;
					var htmlElement = "";
					for(var i=0;i<array.length; i++)
					{
						var link = array[i].link;
						var image =array[i].images.standard_resolution.url;
						var dateObj = new Date(parseInt(array[i].created_time) * 1000);
						var day = dateObj.getUTCDate();
						var month = dateObj.toLocaleString("en-us", { month: "short" }).toUpperCase();
						var description;
						if(array[i].caption){
							description = (array[i].caption.text.length <= 115) ? array[i].caption.text : array[i].caption.text.substring(0,115) + '...';
						}
						else{
							description='';
						}
						htmlElement += "<div class='image-contanor' style='background: url(\"" + image  + "\");'> <div class=\"fdw-background\"><a aria-label=\""+description+ "\" href=\"" + link + "\"><p>" + description + "</p> <div class=\"date_overlay\"><div class=\"date_month_wrapper\"><span class=\"date_month\">" + month  + "</span></div><span class=\"date_day\">" + day + "</span></a></div></div> </div>";

					}
				   $("#instaFeed").html(htmlElement);
				   $('#instaFeed').customScrollbar();
				   $('.fdw-background').hover(
					   function () {
						   $(this).animate({opacity:'1'});
					   },
					   function () {
						   $(this).animate({opacity:'0'});
					   }
				   );

				}).fail(function(error) {
					console.info('API retrieval failed: ' + error);
				   $("#instaFeed").hide();
				})
		}
	}
	
	   
});
function pad(pad, str, padLeft) {
  if (typeof str === 'undefined') 
    return pad;
  if (padLeft) {
    return (pad + str).slice(-pad.length);
  } else {
    return (str + pad).substring(0, pad.length);
  }
}
