package SysPowerRoleMapper;

import java.math.BigDecimal;
import java.util.List;

import com.sc.entity.SysPowerRole;

public interface SysPowerRoleService {
	public List<SysPowerRole> selectByRid(BigDecimal rId);
}
