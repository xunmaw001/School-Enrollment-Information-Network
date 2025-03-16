
var projectName = '学校招生信息网';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
]


var indexNav = [

{
	name: '党员风采',
	url: './pages/dangyuanfengcai/list.jsp'
}, 
{
	name: '校园之家',
	url: './pages/xiaoyuanzhijia/list.jsp'
}, 
{
	name: '师资队伍',
	url: './pages/shiziduiwu/list.jsp'
}, 
{
	name: '院系简介',
	url: './pages/yuanxijianjie/list.jsp'
}, 
{
	name: '专业简介',
	url: './pages/zhuanyejianjie/list.jsp'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspmu597o/index.jsp";

var cartFlag = false

var chatFlag = false


chatFlag = true


var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"党员风采","menuJump":"列表","tableName":"dangyuanfengcai"}],"menu":"党员风采管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"校园之家","menuJump":"列表","tableName":"xiaoyuanzhijia"}],"menu":"校园之家管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"师资队伍","menuJump":"列表","tableName":"shiziduiwu"}],"menu":"师资队伍管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"院系简介","menuJump":"列表","tableName":"yuanxijianjie"}],"menu":"院系简介管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"专业简介","menuJump":"列表","tableName":"zhuanyejianjie"}],"menu":"专业简介管理"},{"child":[{"buttons":["新增","查看","修改","删除","学生录取"],"menu":"录取信息","menuJump":"列表","tableName":"luquxinxi"}],"menu":"录取信息管理"},{"child":[{"buttons":["查看","修改","删除"],"menu":"学生录取","menuJump":"列表","tableName":"xueshengluqu"}],"menu":"学生录取管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"校园公告","tableName":"news"},{"buttons":["查看","修改","删除"],"menu":"客服咨询","tableName":"chat"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"党员风采列表","menuJump":"列表","tableName":"dangyuanfengcai"}],"menu":"党员风采模块"},{"child":[{"buttons":["查看"],"menu":"校园之家列表","menuJump":"列表","tableName":"xiaoyuanzhijia"}],"menu":"校园之家模块"},{"child":[{"buttons":["查看"],"menu":"师资队伍列表","menuJump":"列表","tableName":"shiziduiwu"}],"menu":"师资队伍模块"},{"child":[{"buttons":["查看"],"menu":"院系简介列表","menuJump":"列表","tableName":"yuanxijianjie"}],"menu":"院系简介模块"},{"child":[{"buttons":["查看"],"menu":"专业简介列表","menuJump":"列表","tableName":"zhuanyejianjie"}],"menu":"专业简介模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"录取信息","menuJump":"列表","tableName":"luquxinxi"}],"menu":"录取信息管理"},{"child":[{"buttons":["查看"],"menu":"学生录取","menuJump":"列表","tableName":"xueshengluqu"}],"menu":"学生录取管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"党员风采列表","menuJump":"列表","tableName":"dangyuanfengcai"}],"menu":"党员风采模块"},{"child":[{"buttons":["查看"],"menu":"校园之家列表","menuJump":"列表","tableName":"xiaoyuanzhijia"}],"menu":"校园之家模块"},{"child":[{"buttons":["查看"],"menu":"师资队伍列表","menuJump":"列表","tableName":"shiziduiwu"}],"menu":"师资队伍模块"},{"child":[{"buttons":["查看"],"menu":"院系简介列表","menuJump":"列表","tableName":"yuanxijianjie"}],"menu":"院系简介模块"},{"child":[{"buttons":["查看"],"menu":"专业简介列表","menuJump":"列表","tableName":"zhuanyejianjie"}],"menu":"专业简介模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
