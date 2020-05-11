package jpabook.jpashop;

import jpabook.jpashop.test.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hello");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
/*
            TMember member = new TMember();
            member.setUserName("member1");
            member.setHomeTAddress(new TAddress("1", "2", "3"));
            member.getFavoriteFoods().add("h1");
            member.getFavoriteFoods().add("h2");
            member.getFavoriteFoods().add("h3");

            member.getAddressesHistory().add(new AddressEntity("2" , "3", "4"));
            member.getAddressesHistory().add(new AddressEntity("3" , "4", "5"));

            entityManager.persist(member);

            entityManager.flush();
            entityManager.clear();

            System.out.println("===============START=======");
            TMember findMember = entityManager.find(TMember.class, member.getId());

            findMember.setHomeTAddress(new TAddress("hihi" , "hihi"  , "hihi"));


            findMember.getFavoriteFoods().remove("h1");
            findMember.getFavoriteFoods().add("한식");


            findMember.getAddressesHistory().remove(new AddressEntity("3" , "4", "5"));
            findMember.getAddressesHistory().add(new AddressEntity("1", "3" , "4"));
*/

            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            entityManager.close();
        }
        entityManagerFactory.close();
    }

}
