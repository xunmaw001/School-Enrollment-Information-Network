<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport"
    content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="renderer" content="webkit" />
  <meta name="robots" content="index, follow" />
  <title>首页</title>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link rel="stylesheet" href="../../xznstatic/css/style_1.css" />
  <link rel="stylesheet" href="../../xznstatic/css/responsive.css" />
  <link rel="stylesheet" href="../../xznstatic/css/color1.css" id="jssDefault" />
  <link rel="stylesheet" href="../../xznstatic/css/tk.css" />
</head>

<body>
  <div id="app">
    <div class="layui-carousel" id="swiper">
      <div carousel-item id="swiper-item">
        <div v-for="(item,index) in swiperList" v-bind:key="index">
          <img class="swiper-item" :src="item.img" width="100%" height="400px">
        </div>
      </div>
    </div>


      <section class="support-area" id="home-know">
        <div class="container">
          <div class="row">
            <div class="col-md-4 col-sm-12 col-xs-12" id="hact-img">
              <div class="img-holder"> <img alt="" src="../../xznstatic/images/activities.png"> </div>
            </div>
            <div class="col-md-8 col-sm-12 col-xs-12 support-content" id="hact-content">
              <h3 class="white-title dark-title"><a href="#">新闻资讯</a></h3>
              <div class="row">
                <div class="col-md-4 col-sm-4 col-xs-4 item" v-for="(item,index) in newsList" v-bind:key="index">
                  <div class="single-item">
                    <div class="icon-holder">
                      <figure><a @click="jump('../news/detail.jsp?id='+item.id)"><img :src="item.picture" /></a></figure>
                    </div>
                    <div class="content">
                      <h3 class="text-ellipsis iknow-title">
                      <a @click="jump('../news/detail.jsp?id='+item.id)" :title="item.title">{{item.title}}</a></h3>
                      <p class="iknow-date"><i class="fa fa-calendar-o"></i> {{item.addtime}}</p>
                      <p class="iknow-desc">{{item.content|newsDesc}}...</p>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>

    <section class="experienced-trainer-area" id="home-team">
      <div class="container">
        <div class="section-title text-center">
          <h1><span><a href="#">党员风采展示</a></span></h1>
        </div>
        <div class="row">
          <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6 item" v-for="(item,index) in dangyuanfengcaiList" v-bind:key="index">
            <div class="single-item">
              <div class="img-holder">
                <figure>
                  <a :href="'../dangyuanfengcai/detail.jsp?id='+item.id">
                    <img :src="item.touxiang?item.touxiang.split(',')[0]:''" />
                  </a>
                </figure>
                <div class="overlay-content">
                  <div class="overlay-buttom">
                    <div class="trainer-name">
                      <div class="name pull-left">
                        <h3 class="text-ellipsis iteam-title"><a :href="'../dangyuanfengcai/detail.jsp?id='+item.id">{{item.jiaoshixingming}}</a></h3>
                        <span v-if="item.price">{{item.price}} RMB</span>
                      </div>
                    </div>
                    <p class="item-desc" style="width: 268px;"></p>
                  </div>
                </div>
              </div>
              <div class="content">
                <div class="trainer-name">
                  <div class="name pull-left">
                    <h3 class="text-ellipsis iteam-title"><a :href="'../dangyuanfengcai/detail.jsp?id='+item.id">{{item.jiaoshixingming}}</a></h3>
                    <span class="text-ellipsis item-pos" v-if="item.price">{{item.price}} RMB</span>
                  </div>
                </div>
                <p class="item-desc" style="width: 268px;"></p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <section class="experienced-trainer-area" id="home-team">
      <div class="container">
        <div class="section-title text-center">
          <h1><span><a href="#">师资队伍展示</a></span></h1>
        </div>
        <div class="row">
          <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6 item" v-for="(item,index) in shiziduiwuList" v-bind:key="index">
            <div class="single-item">
              <div class="img-holder">
                <figure>
                  <a :href="'../shiziduiwu/detail.jsp?id='+item.id">
                    <img :src="item.touxiang?item.touxiang.split(',')[0]:''" />
                  </a>
                </figure>
                <div class="overlay-content">
                  <div class="overlay-buttom">
                    <div class="trainer-name">
                      <div class="name pull-left">
                        <h3 class="text-ellipsis iteam-title"><a :href="'../shiziduiwu/detail.jsp?id='+item.id">{{item.jiaoshixingming}}</a></h3>
                        <span v-if="item.price">{{item.price}} RMB</span>
                      </div>
                    </div>
                    <p class="item-desc" style="width: 268px;"></p>
                  </div>
                </div>
              </div>
              <div class="content">
                <div class="trainer-name">
                  <div class="name pull-left">
                    <h3 class="text-ellipsis iteam-title"><a :href="'../shiziduiwu/detail.jsp?id='+item.id">{{item.jiaoshixingming}}</a></h3>
                    <span class="text-ellipsis item-pos" v-if="item.price">{{item.price}} RMB</span>
                  </div>
                </div>
                <p class="item-desc" style="width: 268px;"></p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>

    <section class="footer-bottom-area" id="copyright">
      <div class="container ">
        <div class="footer-bottom">
          <div class="clearfix">
            <div class="Copy-LE" style="text-align: center;">
              <div class="copy-right">
                <p v-text="projectName"></p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    <div class="scroll-to-top scroll-to-target" data-target="html"><span class="fa fa-angle-up"></span></div>
  </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <!-- 组件配置信息 -->
  <script src="../../js/config.js"></script>
  <!-- 扩展插件配置信息 -->
  <script src="../../modules/config.js"></script>
  <!-- 工具方法 -->
  <script src="../../js/utils.js"></script>
  
  <script type="text/javascript">
    var vue = new Vue({
      el: '#app',
      data: {
        projectName: projectName,
        swiperList: [{
          img: '../../img/banner.jpg'
        }],

        dangyuanfengcaiList: [],
        shiziduiwuList: [],
        newsList: []
      },
      filters: {
        newsDesc: function(val) {
          if (val) {
            val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
            if (val.length > 60) {
              val = val.substring(0, 60);
            }

            return val;
          }
          return '';
        }
      },
      methods: {
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var form = layui.form;
      var carousel = layui.carousel;
      var http = layui.http;
      var jquery = layui.jquery;

      http.request('config/list', 'get', {
        page: 1,
        limit: 5
      }, function(res) {
        if (res.data.list.length > 0) {
          var swiperItemHtml = '';
          for (let item of res.data.list) {
            if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
              swiperItemHtml +=
                '<div>' +
                '<img class="swiper-item" src="' + item.value + '" width="100%" height="400px">' +
                '</div>';
            }
          }
          jquery('#swiper-item').html(swiperItemHtml);
          // 轮播图
          carousel.render({
            elem: '#swiper',
            width: '100%',
            height: '400px',
            arrow: 'always',
            anim: 'fade',
            interval: 1800,
            indicator: 'inside'
          });
        }
      });

      http.request('news/list', 'get', {
        page: 1,
        limit: 6,
        order: 'desc'
      }, function(res) {
        vue.newsList = res.data.list;
      });
                  
              
      http.request(`dangyuanfengcai/list`, 'get', {
        page: 1,
        limit: 10
      }, function(res) {
        vue.dangyuanfengcaiList = res.data.list;
      });
      http.request(`shiziduiwu/list`, 'get', {
        page: 1,
        limit: 10
      }, function(res) {
        vue.shiziduiwuList = res.data.list;
      });
    });
  </script>
</body>

</html>