document.addEventListener('DOMContentLoaded', function() {
    const registerButtons = document.querySelectorAll('.register-button, .register-now-button');
    const learnMoreButton = document.querySelector('.learn-more-button');

    registerButtons.forEach(button => {
        button.addEventListener('click', function() {
            alert('Registration functionality will be implemented here.');
        });
    });

    if (learnMoreButton) {
        learnMoreButton.addEventListener('click', function() {
            alert('Learn more functionality will be implemented here.');
        });
    }
});
