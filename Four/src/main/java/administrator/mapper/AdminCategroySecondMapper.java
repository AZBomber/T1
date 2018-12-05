

package administrator.mapper;

import java.util.List;

import pojo.CategroySecond;

public interface AdminCategroySecondMapper {
	public List<CategroySecond> findAllCategroySeconds();
	public void deleteOne(Integer csid);
    public void editone(CategroySecond categroySecond);
    public void addCategroySecond(CategroySecond categroySecond);
}
