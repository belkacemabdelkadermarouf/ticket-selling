document.addEventListener('DOMContentLoaded', function() {
    const planButtons = document.querySelectorAll('.plan-button');
    const chosenPlan = document.getElementById('chosen-plan');
    const priceDisplay = document.getElementById('price');
    const subscribeButton = document.querySelector('.subscribe-button');

    let selectedPlan = null;

    planButtons.forEach(button => {
        button.addEventListener('click', function() {
            planButtons.forEach(btn => btn.classList.remove('selected')); 
            this.classList.add('selected');
            selectedPlan = this.textContent.split('\n')[0]; 
            const price = this.getAttribute('data-price');
            chosenPlan.textContent = selectedPlan;
            priceDisplay.textContent = price + ' DA';
        });
    });

    subscribeButton.addEventListener('click', function() {
        if (selectedPlan) {
            alert('You have subscribed to the ' +  the actual subscription process
        } else {
            alert('Please select a plan first.');
        }
    });
});
        function toggleEventsDropdown(event) {
            event.preventDefault(); 
            const dropdown = document.getElementById('eventsDropdown');
            dropdown.style.display = dropdown.style.display === 'flex' ? 'none' : 'flex';
        }

        window.onclick = function(event) {
            if (!event.target.matches('.events-link a')) {
                const dropdowns = document.getElementsByClassName("events-dropdown");
                for (let i = 0; i < dropdowns.length; i++) {
                    const openDropdown = dropdowns[i];
                    if (openDropdown.style.display === 'flex') {
                        openDropdown.style.display = 'none';
                    }
                }
            }
        }
        