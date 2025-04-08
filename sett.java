document.addEventListener("DOMContentLoaded", () => {
    const searchBar = document.querySelector(".search-bar");
    const searchIcon = document.querySelector(".search-icon");
    const searchInput = document.getElementById("searchInput");
    const resultsDiv = document.getElementById("searchResults");

    // Toggle search bar visibility
    function toggleSearchBar() {
        searchBar.style.display = searchBar.style.display === "block" ? "none" : "block";
        if (searchBar.style.display === "block") {
            searchInput.focus();
        }
    }

    // Close search bar when clicking outside
    document.addEventListener("click", (event) => {
        if (!searchBar.contains(event.target) && !searchIcon.contains(event.target)) {
            searchBar.style.display = "none";
        }
    });

    searchIcon.addEventListener("click", (event) => {
        event.stopPropagation(); // Prevents click from immediately closing
        toggleSearchBar();
    });

    const events = [
        "Summer Music Festival",
        "Comedy Night Special",
        "Tech Conference 2023",
        "FROMAGE United Tickets"
    ];

    searchInput.addEventListener("keyup", () => {
        const query = searchInput.value.toLowerCase();
        resultsDiv.innerHTML = "";
        if (query) {
            const filteredEvents = events.filter(event => event.toLowerCase().includes(query));
            if (filteredEvents.length > 0) {
                resultsDiv.style.display = "block";
                filteredEvents.forEach(event => {
                    const div = document.createElement("div");
                    div.textContent = event;
                    div.onclick = () => {
                        window.location.href = `results.html?event=${encodeURIComponent(event)}`;
                    };
                    resultsDiv.appendChild(div);
                });
            } else {
                resultsDiv.style.display = "none";
            }
        } else {
            resultsDiv.style.display = "none";
        }
    });
});
// Example: Change button color on click
const primaryBtn = document.querySelector('.btn-primary');
const secondaryBtn = document.querySelector('.btn-secondary');

primaryBtn.addEventListener('click', () => {
    primaryBtn.style.backgroundColor = '#003366';
});

secondaryBtn.addEventListener('click', () => {
    secondaryBtn.style.backgroundColor = '#d1d5db'; 
});
<script>
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
</script>