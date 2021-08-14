package com.gugawag.pdist.ejbs;

import com.gugawag.pdist.model.Mensagem;
import com.gugawag.pdist.model.Usuario;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class MensagemDAO {

    @PersistenceContext(unitName="default")
    private EntityManager em;

    public void inserir(Mensagem novaMensagem){
        em.persist(novaMensagem);
    }

    public List<Mensagem> listar() {
        return em.createQuery("FROM Mensagem").getResultList();
    }

    public Mensagem pesquisarPorId(long id){
         TypedQuery<Mensagem> query = em.createQuery(
                 "FROM Mensagem WHERE id="+id,Mensagem.class);
              Mensagem mensagem = query.getSingleResult();
        return mensagem;

    }
}
