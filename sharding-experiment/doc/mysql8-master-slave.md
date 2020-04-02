```
# 获取主库信息
show master status;

# 配置从库
stop slave;
change master to master_host='xxx',
    master_user='xxx', master_password='xxx',
    master_log_file='xxx', master_log_pos=xxx;
start slave;
show slave status;
```