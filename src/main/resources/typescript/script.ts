function getTime() {
    let day = new Date();
    let month = 0, currentDate = "";
    month = day.getMonth() + 1;
    currentDate = day.getDate() + "-" + month + "-" + day.getFullYear();
    document.getElementById("todaysDate").innerHTML = currentDate;
}