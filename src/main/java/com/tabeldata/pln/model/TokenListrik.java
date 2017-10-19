
package com.tabeldata.pln.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="token_listrik")
public class TokenListrik {
    
    @Id 
    @GeneratedValue
    private Integer Id;
    private Integer kode;
    private BigDecimal nama_produk;
    private BigDecimal harga;
}
