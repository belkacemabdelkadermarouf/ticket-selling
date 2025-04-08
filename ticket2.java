document.addEventListener('DOMContentLoaded', function () {
    const closeButton = document.querySelector('.payment-window .close-button');
    const backButton = document.querySelector('.payment-window .actions .back-button');
    const confirmButton = document.querySelector('.payment-window .actions .confirm-button');

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
                // Uncomment the line below to redirect
                // window.location.href = 'ticket3.html';
            } else {
                alert('Please select a payment method.');
            }
        });
    }

    // Select payment method using event delegation
    document.addEventListener('click', function (event) {
        if (event.target.matches('.payment-option.selectable-option')) {
            if (selectedPaymentOption) {
                selectedPaymentOption.classList.remove('selected');
            }

            event.target.classList.add('selected');
            selectedPaymentOption = event.target;

            console.log('Selected payment option:', event.target.dataset.paymentType);
        }
    });
});
