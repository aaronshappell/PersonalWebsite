var onClick = function(id){
    document.querySelector(".nav-item.active").classList.toggle("active");
    document.getElementById(id.substring(5)).classList.toggle("active");
    var prevPage = document.querySelector(".page.active");
    prevPage.classList.toggle("active");
    prevPage.style.height = 0;
    prevPage.style.opacity = 0;
    var page = document.getElementById(id);
    page.classList.toggle("active");
    page.style.height = page.firstElementChild.clientHeight + "px";
    page.style.opacity = "1";
}

var onResize = function(){
    var activePage = document.querySelector(".page.active");
    activePage.style.height = activePage.firstElementChild.clientHeight + "px";
}

document.getElementById("home").addEventListener("click", onClick.bind(this, "page-home"));
document.getElementById("projects").addEventListener("click", onClick.bind(this, "page-projects"));
document.getElementById("cv").addEventListener("click", onClick.bind(this, "page-cv"));
document.getElementById("contact").addEventListener("click", onClick.bind(this, "page-contact"));

window.addEventListener("resize", onResize);

onClick("page-home");