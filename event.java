document.addEventListener('DOMContentLoaded', function() {
    const filterButtons = document.querySelectorAll('.filter-btn');
    const eventCards = document.querySelectorAll('.event-card');

    filterButtons.forEach(button => {
        button.addEventListener('click', function() {
            filterButtons.forEach(btn => btn.classList.remove('active'));
            this.classList.add('active');

            const filter = this.textContent.toLowerCase();

            eventCards.forEach(card => {
                const eventDate = card.querySelector('p:nth-child(3)').textContent; 
                let display = true;

                if (filter === 'upcoming') {
           
                } else if (filter === 'past') {
           
                }

                card.style.display = display ? 'flex' : 'none';
            });
        });
    });

    function isUpcoming(dateString) {
        return true; 
    }

    function isPast(dateString) {

        return false; 
    }
});