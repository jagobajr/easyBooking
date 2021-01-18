package es.deusto.ingenieria.sd.auctions.server.data.dto;

import java.util.ArrayList;
import java.util.List;

import es.deusto.ingenieria.sd.auctions.server.data.Aerolinea;
import es.deusto.ingenieria.sd.auctions.server.data.Aeropuerto;

public class AerolineaAssembler {
    private static AerolineaAssembler instance;

    private AerolineaAssembler() { }

    public static AerolineaAssembler getInstance() {
        if (instance == null) {
            instance = new AerolineaAssembler();
        }

        return instance;
    }


    public AeropuertoDTO entityToDTO(Aeropuerto aeropuerto) {
        AeropuertoDTO dto = new AeropuertoDTO();

        dto.setNombre(aeropuerto.getNombre());
        dto.setLocalidad(aeropuerto.getLocalidad());

        return dto;
    }
    /*
    public List<AeropuertoDTO> entityToDTO(List<Aerolinea> aerolinea) {
        List<AeropuertoDTO> dtos = new ArrayList<>();

        for (Aeropuerto aerolineas : aerolinea) {
            dtos.add(this.entityToDTO(aerolineas));
        }

        return dtos;
    }*/
}
