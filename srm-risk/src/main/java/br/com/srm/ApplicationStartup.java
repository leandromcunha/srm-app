package br.com.srm;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.srm.entity.Risk;

@Component
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    @PersistenceContext
    private EntityManager em;

    private Boolean startup = Boolean.TRUE;

    @Transactional
    @Override
    public void onApplicationEvent(final ContextRefreshedEvent event) {
        if (this.startup) {
            this.startup = Boolean.FALSE;
            this.em.persist(new Risk("A"));
            this.em.persist(new Risk("B",new BigDecimal("0.10")));
            this.em.persist(new Risk("C",new BigDecimal("0.20")));
            this.em.flush();
        }
    }
}
