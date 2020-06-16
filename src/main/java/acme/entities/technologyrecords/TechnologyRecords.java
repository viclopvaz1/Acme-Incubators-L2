
package acme.entities.technologyrecords;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TechnologyRecords extends DomainEntity {

	public static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@NotBlank
	private String				sector;

	@NotBlank
	private String				name;

	@NotBlank
	private String				description;

	@URL
	@NotBlank
	private String				web;

	@NotBlank
	private String				email;

	private Boolean				indication;

	@Range(min = -5, max = 5)
	private Integer				star;
}
