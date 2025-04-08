onst tabs = document.querySelectorAll('.events-tabs button');
tabs.forEach(tab => {
    tab.addEventListener('click', () => {
        tabs.forEach(t => t.classList.remove('active'));
        tab.classList.add('active');
    });
});

const viewDetailsBtns = document.querySelectorAll('.view-details-btn');
viewDetailsBtns.forEach(btn => {
    btn.addEventListener('click', () => {
