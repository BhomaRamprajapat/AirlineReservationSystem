package airline.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import airline.model.Flight;
import airline.model.FlightSearch;

@Repository
public class FlightDao 
{
 @Autowired
 HibernateTemplate hibernateTemplate;
 
 @Transactional
 public int saveFlight(Flight f)
 {
  return (Integer)hibernateTemplate.save(f);
 }
 
 @Transactional
 public void updateFlight(Flight flight)
 {
  hibernateTemplate.update(flight);
 }
 
 @Transactional
 public void deletFlight(int fid)
 {
  hibernateTemplate.delete(hibernateTemplate.get(Flight.class,fid));
 }
 
 @SuppressWarnings({ "deprecation", "unchecked" })
 public List<Object[]> searchFlight(FlightSearch flightSearch)
 {
  //Object[] param={flightSearch.getSrc(),flightSearch.getDst(),flightSearch.getDepart(),flightSearch.getRet(),flightSearch.getfClass()};
  String q="select fid,fname,src,dst,depart,ret,capacity,avail,fClass from flight f where f.src=:src and f.dst=:dst and f.depart=:depart and f.ret=:ret and fClass=:fClass";
  SQLQuery query=hibernateTemplate.getSessionFactory().openSession().createSQLQuery(q); 
  
  query.setString("src",flightSearch.getSrc());
  query.setString("dst",flightSearch.getDst());
  query.setDate("depart",flightSearch.getDepart());
  query.setDate("ret",flightSearch.getRet());
  query.setString("fClass",flightSearch.getfClass());
  
  return query.list();
  //return (List<Object>) hibernateTemplate.find("select from flight where src=? and dst=? and depart=? and ret=? and fClass=?", param);
 }
  
 public List<Flight> flights()
 {
  return hibernateTemplate.loadAll(Flight.class);
 }
 
 
 public Flight flight(int fid)
 {
  return hibernateTemplate.get(Flight.class,fid);
 }
}
