function printsimple()
{ 
		var disp_setting="toolbar=yes,location=no,directories=yes,menubar=yes,";
		disp_setting += "scrollbars=yes,width=760, height=600, left=100, top=25";
		var content_value = document.getElementById("content").innerHTML;
		var docprint=window.open("","",disp_setting); 
			docprint.document.open();
			docprint.document.write('<html><head><link href="/_resources/css/pbsc-print.css" rel="stylesheet" type="text/css" /><meta name="robots" content="noindex, nofollow, noarchive"> <title>Palm Beach State College</title>'); 
			docprint.document.write('</head><body onLoad="self.print()"><div class="printsimple">');          
			docprint.document.write(content_value);          
			docprint.document.write('</div></body></html>'); 
			docprint.document.close(); 
			docprint.focus(); 
}