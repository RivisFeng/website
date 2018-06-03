/*
 Navicat MySQL Data Transfer

 Source Server         : sureface
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 03/06/2018 21:11:45
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province`  (
  `province_id` bigint(6) NOT NULL COMMENT '省ID',
  `province_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '省名称',
  `province_state` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '省状态 0：禁用 1：启用（AES加密）',
  `province_create_time` datetime(0) NOT NULL COMMENT '省创建时间',
  PRIMARY KEY (`province_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '省' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES (110000, '北京市', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (120000, '天津市', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (130000, '河北省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (140000, '山西省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (150000, '内蒙古自治区', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (210000, '辽宁省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (220000, '吉林省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (230000, '黑龙江省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (310000, '上海市', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (320000, '江苏省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (330000, '浙江省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (340000, '安徽省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (350000, '福建省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (360000, '江西省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (370000, '山东省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (410000, '河南省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (420000, '湖北省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (430000, '湖南省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (440000, '广东省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (450000, '广西壮族自治区', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (460000, '海南省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (500000, '重庆市', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (510000, '四川省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (520000, '贵州省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (530000, '云南省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (540000, '西藏自治区', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (610000, '陕西省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (620000, '甘肃省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (630000, '青海省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (640000, '宁夏回族自治区', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (650000, '新疆维吾尔自治区', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (710000, '台湾省', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (810000, '香港特别行政区', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');
INSERT INTO `province` VALUES (820000, '澳门特别行政区', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-27 20:57:52');

SET FOREIGN_KEY_CHECKS = 1;
