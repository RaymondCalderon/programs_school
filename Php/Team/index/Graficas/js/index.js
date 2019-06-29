$(document).ready(function(){

var valor;
var bar = document.getElementById("bar");

    
    
    $("#imprimir").click(function(){
        var valor = $("#input").val();
        console.log(valor);
        var radar = document.getElementById("radar");

        var radar = new Chart(radar, {
            type: 'radar',
            data:{
                labels: ["Xbox", "Playstation", "PC", "Nintendo Switch", "GameBoy", "Mobile"],
                datasets: [{
                    label: '# de jugadores',
                    data: [valor, 900, 1000, 750, 700, 800],
                    backgroundColor:
                    [
                        "green",
                        "black",
                        "gray",
                        "red"
                    ]
                }]
            }
        });
      });
});