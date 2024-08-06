package com.distance.project.utils;

import com.distance.project.model.Country;
import com.distance.project.model.Province;
import com.distance.project.repository.ICountryRepository;
import com.distance.project.repository.IProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProvinceDataLoader implements CommandLineRunner {

    @Autowired
    private ICountryRepository countryRepository;

    @Autowired
    private IProvinceRepository provinceRepository;

    @Override
    public void run(String... args) throws Exception {
        loadProvinceData();
    }

    private void loadProvinceData() {
        if (provinceRepository.count() == 0) {
            Country argentina = countryRepository.findById(1L).orElse(null);
            Country bolivia = countryRepository.findById(2L).orElse(null);
            Country brazil = countryRepository.findById(3L).orElse(null);
            Country chile = countryRepository.findById(4L).orElse(null);
            Country colombia = countryRepository.findById(5L).orElse(null);
            Country ecuador = countryRepository.findById(6L).orElse(null);
            Country paraguay = countryRepository.findById(7L).orElse(null);
            Country peru = countryRepository.findById(8L).orElse(null);

            if (argentina != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Buenos Aires", -34.6037, -58.3816, argentina),
                        new Province("Catamarca", -28.4694, -66.1493, argentina),
                        new Province("Chaco", -26.8000, -60.8833, argentina),
                        new Province("Chubut", -43.6500, -65.0833, argentina),
                        new Province("Córdoba", -31.4167, -64.1833, argentina),
                        new Province("Corrientes", -27.4667, -58.8333, argentina),
                        new Province("Entre Ríos", -31.7500, -60.8333, argentina),
                        new Province("Formosa", -25.0000, -58.1667, argentina),
                        new Province("Jujuy", -24.2000, -65.1667, argentina),
                        new Province("La Pampa", -36.6167, -64.1667, argentina),
                        new Province("La Rioja", -29.4167, -66.8500, argentina),
                        new Province("Mendoza", -32.8833, -68.8333, argentina),
                        new Province("Misiones", -27.4000, -55.8667, argentina),
                        new Province("Neuquén", -38.9500, -68.0593, argentina),
                        new Province("Río Negro", -39.0333, -65.0667, argentina),
                        new Province("Salta", -24.7833, -65.4167, argentina),
                        new Province("San Juan", -31.5372, -68.5256, argentina),
                        new Province("San Luis", -33.3000, -66.3333, argentina),
                        new Province("Santa Cruz", -50.0000, -69.2500, argentina),
                        new Province("Santa Fe", -31.6333, -60.7167, argentina),
                        new Province("Santiago del Estero", -27.7833, -64.2667, argentina),
                        new Province("Tierra del Fuego", -54.8000, -68.3000, argentina),
                        new Province("Tucumán", -26.8333, -65.2167, argentina)
                ));
            }

            if (bolivia != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Chuquisaca", -19.0333, -65.2667, bolivia),
                        new Province("Cochabamba", -17.3833, -66.1667, bolivia),
                        new Province("El Beni", -14.8333, -66.0833, bolivia),
                        new Province("La Paz", -16.5000, -68.1193, bolivia),
                        new Province("Oruro", -17.9667, -67.1167, bolivia),
                        new Province("Pando", -11.0000, -68.7500, bolivia),
                        new Province("Potosí", -19.5833, -65.7500, bolivia),
                        new Province("Santa Cruz", -17.8000, -63.1833, bolivia),
                        new Province("Tarija", -21.5333, -64.7500, bolivia)
                ));
            }

            if (brazil != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Acre", -9.9750, -67.8000, brazil),
                        new Province("Alagoas", -9.5718, -36.7820, brazil),
                        new Province("Amapá", -0.0392, -51.0667, brazil),
                        new Province("Amazonas", -3.1014, -61.2000, brazil),
                        new Province("Bahia", -12.9714, -38.5014, brazil),
                        new Province("Ceará", -3.7172, -38.5433, brazil),
                        new Province("Espírito Santo", -20.3155, -40.3128, brazil),
                        new Province("Goiás", -15.5974, -52.3602, brazil),
                        new Province("Maranhão", -2.5391, -44.2821, brazil),
                        new Province("Mato Grosso", -12.6417, -55.4211, brazil),
                        new Province("Mato Grosso do Sul", -20.4333, -54.6167, brazil),
                        new Province("Minas Gerais", -19.8157, -43.9542, brazil),
                        new Province("Pará", -1.4550, -48.5036, brazil),
                        new Province("Paraíba", -7.1158, -34.8610, brazil),
                        new Province("Paraná", -25.4284, -49.2733, brazil),
                        new Province("Pernambuco", -8.0476, -34.8771, brazil),
                        new Province("Piauí", -5.0892, -42.8014, brazil),
                        new Province("Rio de Janeiro", -22.9068, -43.1729, brazil),
                        new Province("Rio Grande do Norte", -5.7945, -35.2110, brazil),
                        new Province("Rio Grande do Sul", -30.0346, -51.2177, brazil),
                        new Province("Rondônia", -10.7646, -62.3325, brazil),
                        new Province("Roraima", 2.8216, -60.6742, brazil),
                        new Province("Santa Catarina", -27.5954, -48.5480, brazil),
                        new Province("São Paulo", -23.5505, -46.6333, brazil),
                        new Province("Sergipe", -10.9472, -37.0731, brazil),
                        new Province("Tocantins", -10.1815, -48.3333, brazil)
                ));
            }

            if (chile != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Arica y Parinacota", -18.4775, -69.3281, chile),
                        new Province("Atacama", -24.3333, -69.2500, chile),
                        new Province("Antofagasta", -23.6658, -70.3975, chile),
                        new Province("Coquimbo", -29.9511, -71.3416, chile),
                        new Province("Valparaíso", -33.0464, -71.6364, chile),
                        new Province("Metropolitana de Santiago", -33.4489, -70.6693, chile),
                        new Province("O'Higgins", -34.1667, -70.6667, chile),
                        new Province("Maule", -35.0000, -71.6333, chile),
                        new Province("Ñuble", -36.6167, -72.1000, chile),
                        new Province("Biobío", -37.0167, -72.1667, chile),
                        new Province("La Araucanía", -38.7333, -72.5833, chile),
                        new Province("Los Ríos", -39.6667, -73.1333, chile),
                        new Province("Los Lagos", -40.0000, -72.6667, chile),
                        new Province("Aysén", -45.4167, -71.6333, chile),
                        new Province("Magallanes y la Antártica Chilena", -53.0000, -70.6667, chile)
                ));
            }

            if (colombia != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Amazonas", -3.5333, -70.2500, colombia),
                        new Province("Antioquia", 6.2518, -75.5636, colombia),
                        new Province("Arauca", 7.0833, -70.7500, colombia),
                        new Province("Atlántico", 10.4111, -74.1954, colombia),
                        new Province("Bolívar", 10.2500, -75.5000, colombia),
                        new Province("Boyacá", 5.6794, -73.4206, colombia),
                        new Province("Caldas", 5.0717, -75.4828, colombia),
                        new Province("Caquetá", 1.6667, -75.6167, colombia),
                        new Province("Casanare", 5.8333, -72.3833, colombia),
                        new Province("Cauca", 2.6333, -76.5833, colombia),
                        new Province("Cesar", 10.5000, -74.5000, colombia),
                        new Province("Chocó", 5.6000, -76.7000, colombia),
                        new Province("Córdoba", 8.7500, -75.8333, colombia),
                        new Province("Cundinamarca", 4.5833, -74.0000, colombia),
                        new Province("Guainía", 2.6167, -68.0500, colombia),
                        new Province("Guaviare", 2.5667, -70.3667, colombia),
                        new Province("Guajira", 11.5500, -71.5833, colombia),
                        new Province("Huila", 2.6333, -75.1667, colombia),
                        new Province("La Guajira", 11.5500, -71.5833, colombia),
                        new Province("Magdalena", 10.5000, -74.0833, colombia),
                        new Province("Meta", 3.6000, -73.7833, colombia),
                        new Province("Nariño", 1.3333, -77.1667, colombia),
                        new Province("Norte de Santander", 7.7500, -72.5000, colombia),
                        new Province("Putumayo", 1.5833, -76.5833, colombia),
                        new Province("Quindío", 4.5333, -75.6667, colombia),
                        new Province("Risaralda", 4.0833, -75.7167, colombia),
                        new Province("San Andrés y Providencia", 12.5833, -81.7167, colombia),
                        new Province("Santander", 7.0833, -73.1167, colombia),
                        new Province("Sucre", 9.3333, -75.5833, colombia),
                        new Province("Tolima", 4.1000, -75.7333, colombia),
                        new Province("Valle del Cauca", 3.8000, -76.1667, colombia),
                        new Province("Vaupés", 0.7333, -69.2833, colombia),
                        new Province("Vichada", 5.6667, -67.3833, colombia)
                ));
            }

            if (ecuador != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Azuay", -2.9000, -79.0167, ecuador),
                        new Province("Bolívar", -1.6667, -78.9167, ecuador),
                        new Province("Cañar", -2.6667, -78.9167, ecuador),
                        new Province("Carchi", 0.6667, -77.9167, ecuador),
                        new Province("Chimborazo", -1.6667, -78.6667, ecuador),
                        new Province("Cotopaxi", -0.6667, -78.5833, ecuador),
                        new Province("El Oro", -3.8333, -79.4167, ecuador),
                        new Province("Esmeraldas", 0.6667, -79.0833, ecuador),
                        new Province("Galápagos", -0.7500, -90.5833, ecuador),
                        new Province("Guayas", -2.1667, -79.9333, ecuador),
                        new Province("Imbabura", 0.3333, -78.1667, ecuador),
                        new Province("Loja", -4.0833, -79.2167, ecuador),
                        new Province("Los Ríos", -1.5000, -79.6667, ecuador),
                        new Province("Manabí", -0.6667, -80.9667, ecuador),
                        new Province("Morona Santiago", -2.3333, -78.0000, ecuador),
                        new Province("Napo", -0.5833, -77.5000, ecuador),
                        new Province("Orellana", -0.7500, -76.7500, ecuador),
                        new Province("Pastaza", -1.5833, -77.0000, ecuador),
                        new Province("Pichincha", -0.2333, -78.5000, ecuador),
                        new Province("Santa Elena", -2.2333, -80.7167, ecuador),
                        new Province("Santo Domingo de los Tsáchilas", -0.2500, -79.0833, ecuador),
                        new Province("Sucumbíos", 0.0833, -77.8333, ecuador),
                        new Province("Tungurahua", -1.2667, -78.6333, ecuador),
                        new Province("Zamora-Chinchipe", -3.5833, -78.8167, ecuador)
                ));
            }

            if (paraguay != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Alto Paraná", -25.8333, -54.5833, paraguay),
                        new Province("Boquerón", -21.5500, -63.1667, paraguay),
                        new Province("Caaguazú", -24.0000, -55.3333, paraguay),
                        new Province("Caazapá", -27.0000, -56.0000, paraguay),
                        new Province("Central", -25.0833, -57.6333, paraguay),
                        new Province("Concepción", -23.4167, -57.4333, paraguay),
                        new Province("Cordillera", -25.0167, -57.0833, paraguay),
                        new Province("Guairá", -26.0000, -56.7500, paraguay),
                        new Province("Itapúa", -27.0000, -55.6667, paraguay),
                        new Province("Misiones", -27.5000, -54.5000, paraguay),
                        new Province("Ñeembucú", -27.0833, -58.0000, paraguay),
                        new Province("Paraguarí", -25.5833, -57.1667, paraguay),
                        new Province("Presidente Hayes", -23.0000, -60.0000, paraguay),
                        new Province("San Pedro", -23.8333, -58.0833, paraguay)
                ));
            }

            if (peru != null) {
                provinceRepository.saveAll(List.of(
                        new Province("Amazonas", -5.1667, -78.5000, peru),
                        new Province("Áncash", -9.0167, -77.8333, peru),
                        new Province("Apurímac", -14.0167, -73.5833, peru),
                        new Province("Arequipa", -16.4000, -71.5333, peru),
                        new Province("Ayacucho", -13.1583, -74.2231, peru),
                        new Province("Cajamarca", -7.1667, -78.5167, peru),
                        new Province("Callao", -12.0464, -77.0428, peru),
                        new Province("Cusco", -13.5167, -71.9833, peru),
                        new Province("Huancavelica", -12.7667, -75.2333, peru),
                        new Province("Huánuco", -9.9656, -76.2062, peru),
                        new Province("Ica", -13.7167, -75.1500, peru),
                        new Province("Junín", -11.5167, -75.0167, peru),
                        new Province("La Libertad", -8.1167, -77.0167, peru),
                        new Province("Lambayeque", -6.7700, -79.8667, peru),
                        new Province("Lima", -12.0464, -77.0428, peru),
                        new Province("Loreto", -3.7433, -73.2511, peru),
                        new Province("Madre de Dios", -12.5833, -69.1833, peru),
                        new Province("Moquegua", -17.2000, -70.9333, peru),
                        new Province("Pasco", -10.6500, -76.0000, peru),
                        new Province("Piura", -5.1945, -80.6328, peru),
                        new Province("Puno", -15.8400, -70.0216, peru),
                        new Province("San Martín", -6.0667, -76.9833, peru),
                        new Province("Tacna", -18.0200, -70.2500, peru),
                        new Province("Tumbes", -3.5667, -80.6833, peru),
                        new Province("Ucayali", -8.3833, -74.4833, peru)
                ));
            }
        }
    }
}
