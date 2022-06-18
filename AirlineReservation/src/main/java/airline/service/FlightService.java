package airline.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import airline.dao.FlightDao;
import airline.model.Flight;
import airline.model.FlightSearch;

@Service
public class FlightService 
{
 @Autowired
 FlightDao flightDao;
 
 public void saveFlight(Flight f)
 {
  flightDao.saveFlight(f);
 }
 
 public List<Flight> allFlights()
 {
  return flightDao.flights();
 }
 
 public void update(Flight flight)
 {
  flightDao.updateFlight(flight);
 }
 
 public void deleteFlight(int fid)
 {
  flightDao.deletFlight(fid);
 }
 
 public Flight getFlight(int fid)
 {
  return flightDao.flight(fid);
 }
 
 public List<Flight> getFlights(FlightSearch flightSearch)
 {
  List<Object[]> lst=flightDao.searchFlight(flightSearch);
  List<Flight> flight=new ArrayList<Flight>();
  
  for(Object[] x:lst)
   flight.add(new Flight((Integer)x[0],(String)x[1],(String)x[2],(String)x[3],(Date)x[4],(Date)x[5],(Integer)x[6],(Integer)x[7],(String)x[8]));
  
  return flight;
 }
}
