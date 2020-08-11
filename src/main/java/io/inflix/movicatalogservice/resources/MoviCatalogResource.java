package io.inflix.movicatalogservice.resources;

import java.util.Collections;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.inflix.movicatalogservice.models.CatalogItem;

@RestController
@RequestMapping("catalog")
public class MoviCatalogResource {
	@RequestMapping("/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable ("userId") String userId){
		return Collections.singletonList(
		new CatalogItem("Tranformmer", "test",4)
		);
	}
}
