
//get context path
function getContextPath() {
    return window.location.pathname.substring(0, window.location.pathname.indexOf("/", 2));
}
var contextPath = getContextPath();

//back to top and fixed navigation event
function fBackToTopAndFixedNavbar() {
    if ($('#back-to-top').length) {
        var scrollTrigger = 583,
                fnc = function () {
                    var scrollTop = $(window).scrollTop();
                    if (scrollTop > scrollTrigger) {
                        $('#navbar').addClass('fnb');
                        $('.category').addClass('hide');
                        $('#back-to-top').addClass('show');
                    } else {
                        $('#navbar').removeClass('fnb');
                        $('.category').removeClass('hide');
                        $('#back-to-top').removeClass('show');
                    }
                };
        fnc();
        $(window).on('scroll', function () {
            fnc();
        });
        $('#back-to-top').on('click', function (e) {
            e.preventDefault();
            $('html,body').animate({
                scrollTop: 0
            }, 700);
        });
    }
}

function rotateX(x) {
    $('#sn a').css({
        "- webkit - transform": "rotate(" + x + "deg)", /* Chrome, Safari 3.1+ */
        "- moz - transform": "rotate(" + x + "deg)", /* Firefox 3.5-15 */
        "- ms - transform": "rotate(" + x + "deg)", /* IE 9 */
        "- o - transform": "rotate(" + x + "deg)", /* Opera 10.50-12.00 */
        "transform": "rotate(" + x + "deg)" /* Firefox 16+, IE 10+, Opera 12.50+ */
    });
}

function togleCategory(x) {
    $('#sn').click(function () {
        x += 360;
        rotateX(x);
        if ($('.category').is(':hidden')) {
            $('.category').removeClass('hide').hide().show(500);
        } else {
            $('.category').hide().show(500);
        }
    });
    $('.category li h2').click(function () {
        $(this).parent().parent().find('li').find('ul').hide(200);
        $(this).parent().find('.subCt').show(500);
    });
}

$(document).ready(function () {

    fBackToTopAndFixedNavbar();
    togleCategory(180);
});