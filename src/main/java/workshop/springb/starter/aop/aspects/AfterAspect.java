package workshop.springb.starter.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import workshop.springb.starter.aop.Constans;

/*
    TODO 2a zmień klasę w  aspect, działający tylko w profilu 'after'
    done
 */
@Aspect
@Profile(Constans.AFTER)
@Component
public class AfterAspect {



    /*
        TODO 2b
        Advice: after, z pointcut'em wskazującym na metody, których nazwa zaczyna się na 'gr'


        Wypisz do konsoli profil i JoinPoint#getKind() after +

     */

    @After("workshop.springb.starter.aop.pointcuts.AppPointcuts.allStartedOnGr()")
    public void properName(JoinPoint joinPoint){
        System.out.println("Profil : " + Constans.AFTER);
        System.out.println(joinPoint.getKind());
    }


}
// TODO 2c - utwórz test (klasa testowa już czeka) ツ
