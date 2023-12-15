package bean;
// Generated 08/12/2023 09:35:32 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuarioEbg generated by hbm2java
 */
@Entity
@Table(name="usuario_ebg"
    ,catalog="db_estefani_gimenez"
)
public class UsuarioEbg  implements java.io.Serializable {


     private int idusuarioEbg;
     private String nomeEbg;
     private String apelidoEbg;
     private String cpfEbg;
     private Date nascimentoEbg;
     private int nivelEbg;
     private String ativoEbg;
     private String senhaEbg;

    public UsuarioEbg() {
    }

    public UsuarioEbg(int idusuarioEbg, String nomeEbg, String apelidoEbg, String cpfEbg, Date nascimentoEbg, int nivelEbg, String ativoEbg, String senhaEbg) {
       this.idusuarioEbg = idusuarioEbg;
       this.nomeEbg = nomeEbg;
       this.apelidoEbg = apelidoEbg;
       this.cpfEbg = cpfEbg;
       this.nascimentoEbg = nascimentoEbg;
       this.nivelEbg = nivelEbg;
       this.ativoEbg = ativoEbg;
       this.senhaEbg = senhaEbg;
    }
   
     @Id 

    
    @Column(name="idusuario_ebg", unique=true, nullable=false)
    public int getIdusuarioEbg() {
        return this.idusuarioEbg;
    }
    
    public void setIdusuarioEbg(int idusuarioEbg) {
        this.idusuarioEbg = idusuarioEbg;
    }

    
    @Column(name="nome_ebg", nullable=false, length=80)
    public String getNomeEbg() {
        return this.nomeEbg;
    }
    
    public void setNomeEbg(String nomeEbg) {
        this.nomeEbg = nomeEbg;
    }

    
    @Column(name="apelido_ebg", nullable=false, length=80)
    public String getApelidoEbg() {
        return this.apelidoEbg;
    }
    
    public void setApelidoEbg(String apelidoEbg) {
        this.apelidoEbg = apelidoEbg;
    }

    
    @Column(name="cpf_ebg", nullable=false, length=80)
    public String getCpfEbg() {
        return this.cpfEbg;
    }
    
    public void setCpfEbg(String cpfEbg) {
        this.cpfEbg = cpfEbg;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="nascimento_ebg", nullable=false, length=10)
    public Date getNascimentoEbg() {
        return this.nascimentoEbg;
    }
    
    public void setNascimentoEbg(Date nascimentoEbg) {
        this.nascimentoEbg = nascimentoEbg;
    }

    
    @Column(name="nivel_ebg", nullable=false)
    public int getNivelEbg() {
        return this.nivelEbg;
    }
    
    public void setNivelEbg(int nivelEbg) {
        this.nivelEbg = nivelEbg;
    }

    
    @Column(name="ativo_ebg", nullable=false, length=80)
    public String getAtivoEbg() {
        return this.ativoEbg;
    }
    
    public void setAtivoEbg(String ativoEbg) {
        this.ativoEbg = ativoEbg;
    }

    
    @Column(name="senha_ebg", nullable=false, length=80)
    public String getSenhaEbg() {
        return this.senhaEbg;
    }
    
    public void setSenhaEbg(String senhaEbg) {
        this.senhaEbg = senhaEbg;
    }




}


