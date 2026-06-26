package com.pedrobarcelos.usuario.business.dto;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelefoneDTO {

    private String numero;
    private String ddd;
    private String ddi;

}
