document.addEventListener('DOMContentLoaded', () => {
    const navItems = document.querySelectorAll('.nav-item');
    const eventCards = document.querySelectorAll('.event-card');

    navItems.forEach(item => {
        item.addEventListener('click', () => {
            navItems.forEach(navItem => navItem.classList.remove('active'));
            item.classList.add('active');

            const filter = item.textContent.toLowerCase();
            eventCards.forEach(card => {
                if (filter === 'upcoming') {
                    card.style.display = 'block';
                } else {
                    card.style.display = 'none';
                }
            });
        });
    });

    const saveButtons = document.querySelectorAll('.save-event');
    saveButtons.forEach(button => {
        button.addEventListener('click', () => {
            const icon = button.querySelector('i');
            if (icon.textContent === 'bookmark_border') {
                icon.textContent = 'bookmark';
            } else {
                icon.textContent = 'bookmark_border';
            }
        });
    });
});