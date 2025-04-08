document.addEventListener('DOMContentLoaded', function() {
    const onlinePaymentButton = document.getElementById('onlinePayment');
    const bankTransferButton = document.getElementById('bankTransfer');
    const onlinePaymentSection = document.getElementById('online-payment-section');
    const bankTransferSection = document.getElementById('bank-transfer-section');

    onlinePaymentButton.addEventListener('click', function() {
        onlinePaymentButton.classList.add('active');
        bankTransferButton.classList.remove('active');
        onlinePaymentSection.classList.remove('hidden');
        bankTransferSection.classList.add('hidden');
    });

    bankTransferButton.addEventListener('click', function() {
        bankTransferButton.classList.add('active');
        onlinePaymentButton.classList.remove('active');
        bankTransferSection.classList.remove('hidden');
        onlinePaymentSection.classList.add('hidden');
    });
});
document.addEventListener('DOMContentLoaded', function() {
    const plans = document.querySelectorAll('.subscription-plan');

    plans.forEach(plan => {
        plan.addEventListener('click', function() {
            plans.forEach(p => p.classList.remove('selected'));

            this.classList.add('selected');

            console.log('Selected Plan:', this.dataset.price);
        });
    });
});
