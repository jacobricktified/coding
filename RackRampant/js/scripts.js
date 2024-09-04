// Ensure the DOM is fully loaded before running scripts
$(document).ready(function () {
    // Initialize Bootstrap tooltips
    $('[data-toggle="tooltip"]').tooltip();

    // Smooth scrolling for anchor links
    $('a[href*="#"]:not([href="#"])').on('click', function (event) {
        if (
            location.pathname.replace(/^\//, '') === this.pathname.replace(/^\//, '') &&
            location.hostname === this.hostname
        ) {
            var target = $(this.hash);
            target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
            if (target.length) {
                $('html, body').animate(
                    {
                        scrollTop: target.offset().top - 50,
                    },
                    1000
                );
                return false;
            }
        }
    });

    // Initialize the Bootstrap carousel with custom settings
    $('.carousel').carousel({
        interval: 5000, // Change slide every 5 seconds
        pause: 'hover', // Pause on hover
        wrap: true,     // Cycle continuously
    });

    // Add more interactivity as needed
    // Example: Toggle class on button click
    $('#exampleButton').on('click', function () {
        $(this).toggleClass('active');
        // Additional actions can be added here
    });

    // Dynamic content loading (example, if you have multiple sections)
    $('nav a').on('click', function (event) {
        event.preventDefault();
        var page = $(this).attr('href');
        $('#content').load(page + ' #content > *');
    });

    // Additional custom JavaScript functions can be added here
});
