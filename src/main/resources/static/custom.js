let map; 
let geocoder;

function initMap(){
    
    geocoder = new google.maps.Geocoder();

    map = new google.maps.Map(document.getElementById('map'), {
        center: { lat: parseFloat(busLocation[0].LATITUDE), lng: parseFloat(busLocation[0].LONGITUDE)},
        zoom: 15,
        scrollwheel: false, 
    });

    let image = 'https://img.icons8.com/android/1x/bus.png';

    for (let i = 0; i < busLocation.length; i++){
        let marker = new google.maps.Marker({
            position: {lat: parseFloat(busLocation[i].LATITUDE), lng: parseFloat(busLocation[i].LONGITUDE)},
            map:map, 
            icon: image,
        })
    }

    geocoder.geocode( { 'address': address}, function(results, status) {
        if (status == 'OK') {
          map.setCenter(results[0].geometry.location);
          var marker = new google.maps.Marker({
              map: map,
              position: results[0].geometry.location
          });
        } else {
          alert('Geocode was not successful for the following reason: ' + status);
        }
      });

}

