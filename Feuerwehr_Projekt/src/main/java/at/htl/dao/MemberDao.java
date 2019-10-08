package at.htl.dao;

import at.htl.entity.Member;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class MemberDao {

    @Inject
    EntityManager em;

    public List<Member> getAll(){
        return em.createNamedQuery("Member.findAll",Member.class).getResultList();
    }

    @Transactional
    public void persist(Member member){
        em.persist(member);
    }

    @Transactional
    public void update(Member member){
        em.merge(member);
    }
}
