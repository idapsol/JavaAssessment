package dapena.ivan.dbConnection;

import net.bytebuddy.pool.TypePool.CacheProvider.Simple.UsingSoftReference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ivan")
public class Controller {
	
	@Autowired
	private Repository repository;
	
	@GetMapping("/getAll")
	public Iterable<Model> getAllUserString() {
		return repository.findAll();
	}
	
	@PostMapping("/create")
	public Model createUser(@RequestBody Model user) {
		return repository.save(user);
	}
	
    
}
