var ua = navigator.userAgent.toLowerCase(),
UA = ua.match(/(opera|ie|trident|firefox|chrome|version)[\s\/:]([\w\d\.]+)?.*?(safari|version[\s\/:]|rv[\s?]([\w\d\.]+)|$)/) || [null, 'unknown', 0],
mode = (UA[1] == 'ie' || UA[1] == 'trident') && document.documentMode;

var Browser = this.Browser = {
	extend: Function.prototype.extend,
	name: (UA[1] == 'version') ? UA[3] : (UA[1] == 'trident' ? "ie" : UA[1]),
	version: mode || parseFloat((UA[1] == 'opera' && UA[4]) ? UA[4] : UA[2])
};
Browser[Browser.name] = true;
Browser[Browser.name + parseInt(Browser.version, 10)] = true;

function Desktop() {
	var p = window; 
	while(p.parent && p != p.parent) { p = p.parent; }
	return p;
}

function DskOpen(wurl, wname, withclose, wid) {
	var content;
	var objid = wid; if (objid==undefined) objid = "main";
	var dskw = Desktop().$('#'+objid);
	if (dskw.tabs('exists', wname)) { dskw.tabs('select', wname);  } 
	else {
		if (wurl){
			if(Browser.chrome){	//判断谷歌浏览器
  				var mainHeight=$("#main").height();
  				content = '<iframe id="'+wname+'" scrolling="auto" frameborder="0"  src="'+wurl+'" width="100%" height="'+(mainHeight-52)+'" ></iframe>';
  			}else{
  				content = '<iframe scrolling="no" frameborder="0"  src="'+wurl+'" style="width:100%;height:100%;"></iframe>'; 
  			}
  		} else { 
  				content = '未实现'; 
		}
  	var closable=withclose; if (closable==undefined) closable = true;
    dskw.tabs('add', { title:wname, closable:closable, content:content, iconCls:'icon-default'});  
  }
}