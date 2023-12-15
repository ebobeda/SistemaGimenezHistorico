package bean;
// Generated 08/12/2023 16:53:50 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ClienteEbg generated by hbm2java
 */
@Entity
@Table(name="cliente_ebg"
    ,catalog="db_estefani_gimenez"
)
public class ClienteEbg  implements java.io.Serializable {


     private int idclienteEbg;
     private String nomeEbg;
     private String generoEbg;
     private String profissaoEbg;
     private Date nascimentoEbg;
     private String rgEbg;
     private String cpfEbg;
     private String emailEbg;
     private String celularEbg;
     private int cepEbg;
     private String enderecoEbg;
     private String numeroEbg;
     private String bairroEbg;
     private String cidadeEbg;
     private String ufEbg;
     private String complementoEbg;

    public ClienteEbg() {
    }

	
    public ClienteEbg(int idclienteEbg, String nomeEbg, String generoEbg, String profissaoEbg, Date nascimentoEbg, String rgEbg, String cpfEbg, String emailEbg, String celularEbg, int cepEbg, String enderecoEbg, String numeroEbg, String bairroEbg, String cidadeEbg, String ufEbg, String complementoEbg) {
        this.idclienteEbg = idclienteEbg;
        this.nomeEbg = nomeEbg;
        this.generoEbg = generoEbg;
        this.profissaoEbg = profissaoEbg;
        this.nascimentoEbg = nascimentoEbg;
        this.rgEbg = rgEbg;
        this.cpfEbg = cpfEbg;
        this.emailEbg = emailEbg;
        this.celularEbg = celularEbg;
        this.cepEbg = cepEbg;
        this.enderecoEbg = enderecoEbg;
        this.numeroEbg = numeroEbg;
        this.bairroEbg = bairroEbg;
        this.cidadeEbg = cidadeEbg;
        this.ufEbg = ufEbg;
        this.complementoEbg = complementoEbg;
    }
     @Id 

    
    @Column(name="idcliente_ebg", unique=true, nullable=false)
    public int getIdclienteEbg() {
        return this.idclienteEbg;
    }
    
    public void setIdclienteEbg(int idclienteEbg) {
        this.idclienteEbg = idclienteEbg;
    }

    
    @Column(name="nome_ebg", nullable=false, length=80)
    public String getNomeEbg() {
        return this.nomeEbg;
    }
    
    public void setNomeEbg(String nomeEbg) {
        this.nomeEbg = nomeEbg;
    }

    
    @Column(name="genero_ebg", nullable=false, length=80)
    public String getGeneroEbg() {
        return this.generoEbg;
    }
    
    public void setGeneroEbg(String generoEbg) {
        this.generoEbg = generoEbg;
    }

    
    @Column(name="profissao_ebg", nullable=false, length=80)
    public String getProfissaoEbg() {
        return this.profissaoEbg;
    }
    
    public void setProfissaoEbg(String profissaoEbg) {
        this.profissaoEbg = profissaoEbg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="nascimento_ebg", nullable=false, length=10)
    public Date getNascimentoEbg() {
        return this.nascimentoEbg;
    }
    
    public void setNascimentoEbg(Date nascimentoEbg) {
        this.nascimentoEbg = nascimentoEbg;
    }

    
    @Column(name="rg_ebg", nullable=false, length=80)
    public String getRgEbg() {
        return this.rgEbg;
    }
    
    public void setRgEbg(String rgEbg) {
        this.rgEbg = rgEbg;
    }

    
    @Column(name="cpf_ebg", nullable=false, length=80)
    public String getCpfEbg() {
        return this.cpfEbg;
    }
    
    public void setCpfEbg(String cpfEbg) {
        this.cpfEbg = cpfEbg;
    }

    
    @Column(name="email_ebg", nullable=false, length=80)
    public String getEmailEbg() {
        return this.emailEbg;
    }
    
    public void setEmailEbg(String emailEbg) {
        this.emailEbg = emailEbg;
    }

    
    @Column(name="celular_ebg", nullable=false, length=80)
    public String getCelularEbg() {
        return this.celularEbg;
    }
    
    public void setCelularEbg(String celularEbg) {
        this.celularEbg = celularEbg;
    }

    
    @Column(name="cep_ebg", nullable=false)
    public int getCepEbg() {
        return this.cepEbg;
    }
    
    public void setCepEbg(int cepEbg) {
        this.cepEbg = cepEbg;
    }

    
    @Column(name="endereco_ebg", nullable=false, length=80)
    public String getEnderecoEbg() {
        return this.enderecoEbg;
    }
    
    public void setEnderecoEbg(String enderecoEbg) {
        this.enderecoEbg = enderecoEbg;
    }

    
    @Column(name="numero_ebg", nullable=false, length=80)
    public String getNumeroEbg() {
        return this.numeroEbg;
    }
    
    public void setNumeroEbg(String numeroEbg) {
        this.numeroEbg = numeroEbg;
    }

    
    @Column(name="bairro_ebg", nullable=false, length=80)
    public String getBairroEbg() {
        return this.bairroEbg;
    }
    
    public void setBairroEbg(String bairroEbg) {
        this.bairroEbg = bairroEbg;
    }

    
    @Column(name="cidade_ebg", nullable=false, length=80)
    public String getCidadeEbg() {
        return this.cidadeEbg;
    }
    
    public void setCidadeEbg(String cidadeEbg) {
        this.cidadeEbg = cidadeEbg;
    }

    
    @Column(name="uf_ebg", nullable=false, length=80)
    public String getUfEbg() {
        return this.ufEbg;
    }
    
    public void setUfEbg(String ufEbg) {
        this.ufEbg = ufEbg;
    }

    
    @Column(name="complemento_ebg", nullable=false, length=80)
    public String getComplementoEbg() {
        return this.complementoEbg;
    }
    
    public void setComplementoEbg(String complementoEbg) {
        this.complementoEbg = complementoEbg;
    }
    @Override
     public String toString() {
     return nomeEbg;
     }
     
     @Override
      public boolean equals (Object object){
      if(object instanceof ClienteEbg){
      ClienteEbg clienteEbg = (ClienteEbg) object;
        if(this.getIdclienteEbg() == clienteEbg.getIdclienteEbg())
            return true;
            }return false;
        }
         
}



