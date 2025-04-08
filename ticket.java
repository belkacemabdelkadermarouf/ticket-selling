document.addEventListener('DOMContentLoaded', function () {
    const closeButton = document.querySelector('.payment-window .close-button');
    const backButton = document.querySelector('.payment-window .actions .back-button');
    const confirmButton = document.querySelector('.payment-window .actions .confirm-button');
    const paymentOptions = document.querySelectorAll('.payment-option.selectable-option');

    let selectedPaymentOption = null;

    // Close the payment window
    if (closeButton) {
        closeButton.addEventListener('click', function () {
            const paymentWindow = document.querySelector('.payment-window');
            if (paymentWindow) {
                paymentWindow.style.display = 'none';
            }
        });
    }

    // Back button logic
    if (backButton) {
        backButton.addEventListener('click', function () {
            console.log('Back button clicked');
            const paymentWindow = document.querySelector('.payment-window');
            if (paymentWindow) {
                paymentWindow.style.display = 'none';
            }
        });
    }

    // Confirm purchase logic
    if (confirmButton) {
        confirmButton.addEventListener('click', function () {
            if (selectedPaymentOption) {
                console.log('Confirm Purchase with:', selectedPaymentOption.dataset.paymentType);
                // Redirect to the next page
                window.location.href = 'ticket3.html';
            } else {
                alert('Please select a payment method.');
            }
        });
    }

    // Select payment method
    paymentOptions.forEach(option => {
        option.addEventListener('click', function () {
            if (selectedPaymentOption) {
                selectedPaymentOption.classList.remove('selected');
            }

            this.classList.add('selected');
            selectedPaymentOption = this;

            console.log('Selected payment option:', this.dataset.paymentType);
        });
    });
});     