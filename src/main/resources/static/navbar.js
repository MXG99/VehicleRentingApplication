$(function () {
    $(window).on('scroll', function () {
        console.log("test");
        if ( $(window).scrollTop() > 10 ) {
            $('.navbar').addClass('active');
        } else {
            $('.navbar').removeClass('active');
        }
    });
});

