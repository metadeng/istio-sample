/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50731
 Source Host           : localhost:3306
 Source Schema         : istio_sample

 Target Server Type    : MySQL
 Target Server Version : 50731
 File Encoding         : 65001

 Date: 27/09/2020 16:54:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tab_book
-- ----------------------------
DROP TABLE IF EXISTS `tab_book`;
CREATE TABLE `tab_book` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `b_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tab_book
-- ----------------------------
BEGIN;
INSERT INTO `tab_book` VALUES ('1', 'test-1', 'metadeng', 12.09, '1');
INSERT INTO `tab_book` VALUES ('2', 'test-2', 'bendraw', 23.89, '2');
INSERT INTO `tab_book` VALUES ('3', 'test-3', 'lvtuben', 32.43, '3');
COMMIT;

-- ----------------------------
-- Table structure for tab_book_detail
-- ----------------------------
DROP TABLE IF EXISTS `tab_book_detail`;
CREATE TABLE `tab_book_detail` (
  `id` varchar(255) NOT NULL,
  `images` varchar(255) DEFAULT NULL,
  `content` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tab_book_detail
-- ----------------------------
BEGIN;
INSERT INTO `tab_book_detail` VALUES ('1', 'ssfsf', 'fwfe');
INSERT INTO `tab_book_detail` VALUES ('2', 'eewew', 'ewwr');
INSERT INTO `tab_book_detail` VALUES ('3', 'daaa', 'dadada');
COMMIT;

-- ----------------------------
-- Table structure for tab_order
-- ----------------------------
DROP TABLE IF EXISTS `tab_order`;
CREATE TABLE `tab_order` (
  `id` varchar(255) NOT NULL,
  `u_id` varchar(255) DEFAULT NULL,
  `cost` decimal(10,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `status` int(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tab_order
-- ----------------------------
BEGIN;
INSERT INTO `tab_order` VALUES ('1', '1', 100.32, '2020-09-23 23:02:33', '2020-09-23 23:02:36', 1, 2);
COMMIT;

-- ----------------------------
-- Table structure for tab_order_detail
-- ----------------------------
DROP TABLE IF EXISTS `tab_order_detail`;
CREATE TABLE `tab_order_detail` (
  `id` varchar(255) NOT NULL,
  `b_id` varchar(255) DEFAULT NULL,
  `o_id` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tab_order_detail
-- ----------------------------
BEGIN;
INSERT INTO `tab_order_detail` VALUES ('1', '1', '1', 32);
COMMIT;

-- ----------------------------
-- Table structure for tab_user
-- ----------------------------
DROP TABLE IF EXISTS `tab_user`;
CREATE TABLE `tab_user` (
  `id` varchar(255) NOT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of tab_user
-- ----------------------------
BEGIN;
INSERT INTO `tab_user` VALUES ('1', 'zhangsan', 'dssdsd', '32423243242', NULL);
INSERT INTO `tab_user` VALUES ('2', 'lisi', 'dsdsfsdfs', '342423', NULL);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
