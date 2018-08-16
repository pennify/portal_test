/**
 * @author: peng
 * @Date:  2018/7/13.
 */
var swiper = new Swiper('.swiper-container', {
    slidesPerView: 1,
    spaceBetween: 30,
    loop: true,
    pagination: {
        el: '.swiper-pagination',
        clickable: true
    },
    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev'
    }
});
$(function () {
    // alert("老洋喝熊！！");
});

function onLaoyang(str) {
    alert(str);
}