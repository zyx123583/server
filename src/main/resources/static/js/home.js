
$(document).ready(function() {

    $(window).load(function(){
        $('#projects-container').css({visibility:'visible'});

        $('#projects-container').masonry({
            itemSelector: '.project-item:not(.filtered)',
            isFitWidth: true,
            isResizable: true,
            isAnimated: !Modernizr.csstransitions,
            gutterWidth: 0
        });

        scrollSpyRefresh();
        waypointsRefresh();
    });

    $('.scrollimation').waypoint(function(){
        $(this).addClass('in');
    },{offset:'90%'});


    $('.project-item').click(function(e){
        e.preventDefault();
    });

    $('#project-modal').on('hidden.bs.modal', function () {
        $(this).find('.loader').show();
    });

    $('#users').owlCarousel({
        singleItem:true,
        autoPlay:3000,
        stopOnHover: true,
        pagination: true
    });

    $('#quotes').owlCarousel({
        singleItem:true,
        autoPlay:300,
        stopOnHover: true,
        pagination: true
    });

    $('a.scrollto').click(function(e){
        if ($('.navbar-collapse').hasClass('in')){
            $('.navbar-collapse').removeClass('in').addClass('collapse');
        }
        $('html,body').scrollTo(this.hash, this.hash, {});
        e.preventDefault();
    });

    function scrollSpyRefresh(){
        setTimeout(function(){
            $('body').scrollspy('refresh');
        },1000);
    }

    function waypointsRefresh(){
        setTimeout(function(){
            $.waypoints('refresh');
        },1000);
    }
});