function resizeIFrameToItsContent(obj) {
	var the_height = obj.contentWindow.document.body.scrollHeight;
	obj.height = the_height;
}
$(function () {
	$(".videofullscreen").attr(
		{
			"allowfullscreen": "",
			"webkitallowfullscreen": "",
			"mozAllowFullScreen": ""
		});
	$(".iframepage").attr(
		{
			"scrolling": "no",
			"frameborder" : "0",
			"style" : "overflow: visible;width: 100%;"
		});	
});
(function ($) {
	$.fn.resizeTwoColums = function (options) {
		/* Defaults */
		var settings = $.extend({
		}, options),
			wrapper = $(this),
			thead_th = [],
			count = 0;

		wrapper.each(function () {
			/* Add each of the TH's to an array */
			$(this).find('thead th').each(function () {
				thead_th.push($(this).html());
			});

			/* Add the corresponding th as data-attr to each td */
			$(this).find('tr').each(function () {
				count = 0;
				$(this).find('td').each(function () {
					$(this).attr('data-th', thead_th[count]);
					count = count + 1;
				});
			});
		});
	}
}(jQuery));
