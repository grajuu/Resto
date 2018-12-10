/**
 * 
 */
package com.tis.mgr.resto.service.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.tis.mgr.resto.service.entity.Reservation;

/**
 * @author mardubudi
 *
 */
@RepositoryRestResource
public interface ReservationRepo extends JpaRepository<Reservation, Long>{
	 @RestResource(path ="by-Name")
	 Collection<Reservation> findByreservationName(@Param ("rm") String rn);

}
