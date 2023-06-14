<template>
  <div class="footer">
    <div class="footer-logo">
      <img src="https://cdn.jsdelivr.net/gh/ZTY18873242003/img/优雅的使用图床/logo-foot.png" alt="">
      <p>大米商城</p>

    </div>

    <img class="logo-explan" src="http://s01.mifile.cn/i/v-logo-2.png" alt="" />
    <img class="logo-explan" src="http://s01.mifile.cn/i/v-logo-1.png" alt="" />
    <img class="logo-explan" src="http://s01.mifile.cn/i/v-logo-3.png" alt="" />
    <div class="footer-link">
      <a href="https://blog.csdn.net/Zhongtongyi" target="_blank">小组成员</a><span>|</span>
      <a href="http://mi.com" target="_blank">大米电子购物网</a><span></span>
    </div>
    <div class="copyright">
      Copyright ©2023 <span class="domain">余京、冉立成、汪京帝、杨晓森、刘金锐、王岚岚</span> All Rights Reserved.
    </div>
    <div class="footer-last-item">
      <div class="col-content">
        联系电话:<h3 class="phone-number">111-1234-1234</h3>
        <p class="phone-desc">
          周一至周日 9:00-22:00<br />
        </p>
        <a href="//www.mi.com/service/contact" target="_blank">
          <span class="server-btn">
            <i></i>
            24小时在线客服
          </span>
        </a>
      </div>
    </div>

  </div>
</template>

<script>
export default {
  // 放入html被调用的标签名：<nav-footer></nav-footer>
  name: 'nav-footer'
}
</script>
<style lang="scss" scoped>
@import './../assets/scss/config.scss';

.footer {
  padding-bottom: 20px;
  height: 282px;
  border-top: 4px solid $colorA;
  background-color: $colorB;
  color: $colorD;
  font-size: 16px;
  text-align: center;
  position: relative;

  .footer-logo {
    margin-top: 46px;
    margin-bottom: 31px;

    img {
      width: 80px;
      height: 80px;
      margin-bottom: 13px;
    }
  }

  .footer-link {
    a {
      color: $colorD;
      display: inline-block;
    }

    span {
      margin: 0 10px;
    }

    margin-bottom:13px;
  }

  .copyright {
    .domain {
      color: $colorA;
    }
  }

  .footer-last-item {
    width: max-content;
    position: absolute;
    bottom: 100px;
    right: 300px;

    .col-content {
      margin-top: -100px;

      .phone-number {
        margin: 0 0 5px;
        font-size: 22px;
        text-align: center;
        margin-bottom: 5px;
        color: #ff6700;
      }

      .phone-desc {
        font-size: 12px;
        line-height: 1.5;
        text-align: center;
        color: #616161;
      }

      .server-btn {
        display: block;
        width: 120px;
        height: 30px;
        line-height: 30px;
        font-size: 12px;
        text-align: center;
        margin: 0 auto;
        border: 1px solid #ff6700;
        color: #ff6700;
        cursor: pointer;

        &:hover {
          background: #ff6700;
          color: #fff;
        }
      }
    }
  }
}
</style>
