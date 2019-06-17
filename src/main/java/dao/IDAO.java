package dao;

import java.util.List;

public interface IDAO<T,K> {
	
	public void insert(T object);
	public T selectById(K noArticle);
	public void update(T object);
	public void delete(T object);
	public List<T> selectAll();

}
