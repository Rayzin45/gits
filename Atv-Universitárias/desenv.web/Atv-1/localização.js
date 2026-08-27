
    function getLocation() {
        
        const locationElement = document.getElementById('location');
        const statusElement = document.getElementById('status');

        if (navigator.geolocation) {
            statusElement.textContent = "Obtendo localização...";
            navigator.geolocation.getCurrentPosition(
                function(position) {
                    locationElement.textContent = `Latitude: ${position.coords.latitude}, Longitude: ${position.coords.longitude}`;
                    statusElement.textContent = "Localização obtida com sucesso!";
                },
                function(error) {
                    switch(error.code) {
                        case error.PERMISSION_DENIED:
                            statusElement.textContent = "Permissão para obter localização negada.";
                            break;
                        case error.POSITION_UNAVAILABLE:
                            statusElement.textContent = "Informação de localização não disponível.";
                            break;
                        case error.TIMEOUT:
                            statusElement.textContent = "Tempo limite para obter localização excedido.";
                            break;
                        default:
                            statusElement.textContent = "Erro desconhecido ao obter localização.";
                            break;
                    }
                }
            );
        } else {
            statusElement.textContent = "Geolocalização não é suportada neste navegador.";
        }
    }