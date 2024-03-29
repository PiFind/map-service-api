# POI 接口设计方案 V0.0.1

| 项    | 描述                        |
|------|---------------------------|
 | 版本号  | 0.0.1                     |
| 发布人  | [zmdo](mailto://i@zmdo.cn) |
| 发布日期 | 2023/01/11                |
 | 状态   | 已完成                       |

## 绪论

POI（一般作为Point of Interest的缩写，也有Point of Information的说法），通常称作兴趣点，泛指互联网电子地图中的点类数据，基本包含名称、地址、坐标、类别四个属性；源于基础测绘成果DLG（Digital Line Graphic，数字线划地图）产品中点类地图要素矢量数据集；在GIS（Geographic Information System，地理信息系统）中指可以抽象成点进行管理、分析和计算的对象。

## 需求分析

由于 PiFind 的当前的工作是需要快速上线，加之当前公司内的资源不足，所以无法做到类似于根据“坐标”查询地址这种功能，我们可以考虑使用第三方提供的服务。

所以目前我们打算提供以下接口：

* 类别接口 ： 类别的增删改查
* 兴趣点接口 ： 
  * 兴趣点基础接口 ：兴趣点的增删改查（基础查询）
  * 兴趣点复杂搜索接口 ：对兴趣点的复杂搜索

## 历史版本

* 无